package com.foster.consulting.assetmanagement.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import javax.annotation.Nullable;
import java.io.Serializable;
import java.util.List;

@Value.Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(as = ImmutableAssetResponseCollectionDTO.class)
public abstract class AssetResponseCollectionDTO implements Serializable {

    @Value.Parameter
    @JsonProperty("assets")
    @Nullable
    public abstract List<AssetResponseDTO> getAssets();
}
