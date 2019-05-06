package com.foster.consulting.assetmanagement.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.foster.consulting.assetmanagement.dto.request.AssetRequestDTO;
import com.foster.consulting.assetmanagement.dto.response.AssetResponseCollectionDTO;
import com.foster.consulting.assetmanagement.dto.response.AssetResponseDTO;
import com.foster.consulting.assetmanagement.dto.response.ImmutableAssetResponseCollectionDTO;
import com.foster.consulting.assetmanagement.dto.response.ImmutableAssetResponseDTO;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class MovieList {

    final static ObjectMapper mapper = new ObjectMapper();

    /**
     * Method to convert the asset json to AssetRequestDTO list.
     * @return List<AssetRequestDTO> object
     */
    public static List<AssetRequestDTO> getAssetCollection() {

        List<AssetRequestDTO> assetCollectionDTO = null;

        try {
            File file = new File("assets.json");

            assetCollectionDTO = Arrays.asList(mapper.readValue(file, AssetRequestDTO[].class));

            return assetCollectionDTO;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return assetCollectionDTO;
    }


    /**
     * Method to return asset as per type
     * @param assetType the type of asset the user is asking for
     * @return List of assert for that type
     * @throws JsonProcessingException exception in case of json processing failure
     */
    public static AssetResponseCollectionDTO getAssetByType(final String assetType) throws JsonProcessingException {

        ImmutableAssetResponseCollectionDTO.Builder assetResponseCollectionDTO = ImmutableAssetResponseCollectionDTO.builder();

        for(AssetRequestDTO assetRequestDTO : getAssetCollection()) {

            if(assetRequestDTO.getObjectClass().equals(assetType)) {

                AssetResponseDTO assetResponseDTO = ImmutableAssetResponseDTO.builder()
                    .assetId(assetRequestDTO.getAsset_id())
                    .title(assetRequestDTO.getTitle())
                    .year(assetRequestDTO.getProduction_year())
                    .build();

                assetResponseCollectionDTO.addAssets(assetResponseDTO);
            }
        }
        return assetResponseCollectionDTO.build();
    }

    /**
     * Method to get all the assetd from the Json
     * @return AssetResponseCollectionDTO object having all the assets
     */
    public static AssetResponseCollectionDTO getAllAssets() {

        ImmutableAssetResponseCollectionDTO.Builder assetResponseCollectionDTO = ImmutableAssetResponseCollectionDTO.builder();

        for(AssetRequestDTO assetRequestDTO : getAssetCollection()) {

            AssetResponseDTO assetResponseDTO = ImmutableAssetResponseDTO.builder()
                .assetId(assetRequestDTO.getAsset_id())
                .title(assetRequestDTO.getTitle())
                .year(assetRequestDTO.getProduction_year())
                .build();

            assetResponseCollectionDTO.addAssets(assetResponseDTO);

        }
        return assetResponseCollectionDTO.build();

    }
}
