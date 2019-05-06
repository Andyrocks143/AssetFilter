package com.foster.consulting.assetmanagement.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import javax.annotation.Nullable;
import java.io.Serializable;
import java.util.List;

@Value.Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(as = ImmutableAssetCollectionDTO.class)
public abstract class AssetCollectionDTO implements Serializable {

    @Value.Parameter
    @com.fasterxml.jackson.annotation.JsonProperty("assets")
    @Nullable
    public abstract List<AssetRequestDTO> getAssets();
}
