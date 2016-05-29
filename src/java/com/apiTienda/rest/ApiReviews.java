/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apiTienda.rest;

import com.apiTienda.datos.JDBC;
import com.apiTienda.modelo.Review;
import com.apiTienda.modelo.TransformadorJson;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * Api RESTful de reviews
 * @author ruben
 */
@Path("/reviews")
public class ApiReviews {

    private TransformadorJson TJson = new TransformadorJson();
    private JDBC dataBase;
    
    public ApiReviews() throws SQLException{
        this.dataBase = new JDBC();
    }

    @GET
    @Path("/{idProducto}")
    public String ObtenerReviewsPorIdProducto(@PathParam("idProducto") Integer idProducto) {
        List<Review> listaReviews = new ArrayList<>();
        try {
            listaReviews = this.dataBase.getReviewsDeProducto(idProducto);
        } catch (SQLException ex) {
            System.out.println("Error al obtener las reviews del productto " + idProducto + "." + ex.getMessage());
        }
        return this.TJson.toJson(listaReviews.toArray());
    }
}
