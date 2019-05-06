package com.foster.consulting.assetmanagement.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.foster.consulting.assetmanagement.dto.response.AssetResponseCollectionDTO;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/assets")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AssetRequestResource {

    /**
     * Method to return asset as per type
     * @param assetType the type of asset the user is asking for
     * @return List of assert for that type
     * @throws JsonProcessingException exception in case of json processing failure
     */
    @GET
    @Path("/{assetType}")
    public Response getAssetByType(@PathParam("assetType") String assetType) throws JsonProcessingException {

        AssetResponseCollectionDTO assetResponseCollectionDTO;
        try {
            assetResponseCollectionDTO = MovieList.getAssetByType(assetType);
        } catch (NullPointerException e) {
            return Response.noContent().build();
        }
        return Response.ok(assetResponseCollectionDTO).build();
    }

    /**
     * Method to get all the assetd from the Json
     * @return AssetResponseCollectionDTO object having all the assets
     */
    @GET
    public Response getAllAssets() throws JsonProcessingException {

        AssetResponseCollectionDTO assetResponseCollectionDTO;
        try {
            assetResponseCollectionDTO = MovieList.getAllAssets();
        } catch (NullPointerException e) {
            return Response.noContent().build();
        }
        return Response.ok(assetResponseCollectionDTO).build();
    }
}
