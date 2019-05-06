package com.foster.consulting.assetmanagement.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import javax.annotation.Nullable;
import java.io.Serializable;

@Value.Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(as = ImmutableAssetResponseDTO.class)
public abstract class AssetResponseDTO implements Serializable {

    @Value.Parameter
    @JsonProperty("assetId")
    @Nullable
    public abstract String getAssetId();

    @Value.Parameter
    @JsonProperty("title")
    @Nullable
    public abstract String getTitle();

    @Value.Parameter
    @JsonProperty("year")
    @Nullable
    public abstract String getYear();
}
