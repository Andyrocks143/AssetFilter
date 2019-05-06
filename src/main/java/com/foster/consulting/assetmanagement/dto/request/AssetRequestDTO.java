package com.foster.consulting.assetmanagement.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import javax.annotation.Nullable;
import java.io.Serializable;
import java.util.List;

@Value.Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(as = ImmutableAssetRequestDTO.class)
public abstract class AssetRequestDTO implements Serializable {

    @Value.Parameter
    @JsonProperty("copyright")
    @Nullable
    public abstract String getCopyright();

    @Value.Parameter
    @JsonProperty("change_date")
    @Nullable
    public abstract String getChange_date();

    @Value.Parameter
    @JsonProperty("orders_buy")
    @Nullable
    public abstract String getOrders_buy();

    @Value.Parameter
    @JsonProperty("asset_id")
    @Nullable
    public abstract String getAsset_id();

    @Value.Parameter
    @JsonProperty("full_object")
    @Nullable
    public abstract String getFull_object();

    @Value.Parameter
    @JsonProperty("episode_number")
    @Nullable
    public abstract String getEpisode_number();

    @Value.Parameter
    @JsonProperty("active_license_starttime")
    @Nullable
    public abstract String getActive_license_starttime();

    @Value.Parameter
    @JsonProperty("description_teaser")
    @Nullable
    public abstract String getDescription_teaser();

    @Value.Parameter
    @JsonProperty("id")
    @Nullable
    public abstract String getId();

    @Value.Parameter
    @JsonProperty("userrating_count_two_star")
    @Nullable
    public abstract String getUserrating_count_two_star();

    @Value.Parameter
    @JsonProperty("fsk_level_list_facet")
    @Nullable
    public abstract List<String> getFsk_level_list_facet();

    @Value.Parameter
    @JsonProperty("generation")
    @Nullable
    public abstract String getGeneration();

    @Value.Parameter
    @JsonProperty("channel_list_facet")
    @Nullable
    public abstract List<String> getChannel_list_facet();

    @Value.Parameter
    @JsonProperty("price_rent")
    @Nullable
    public abstract String getPrice_rent();

    @Value.Parameter
    @JsonProperty("marking_display_list")
    @Nullable
    public abstract List<String> getMarking_display_list();

    @Value.Parameter
    @JsonProperty("editorial_hint")
    @Nullable
    public abstract String getEditorial_hint();

    @Value.Parameter
    @JsonProperty("actor_list_facet")
    @Nullable
    public abstract List<String> getActor_list_facet();

    @Value.Parameter
    @JsonProperty("userrating_count_five_star")
    @Nullable
    public abstract String getUserrating_count_five_star();

    @Value.Parameter
    @JsonProperty("userrating_count_one_star")
    @Nullable
    public abstract String getUserrating_count_one_star();

    @Value.Parameter
    @JsonProperty("marking_list")
    @Nullable
    public abstract List<String> getMarking_list();

    @Value.Parameter
    @JsonProperty("active_license_endtime")
    @Nullable
    public abstract String getActive_license_endtime();

    @Value.Parameter
    @JsonProperty("orders_subscription")
    @Nullable
    public abstract String getOrders_subscription();

    @Value.Parameter
    @JsonProperty("userrating_count_total")
    @Nullable
    public abstract String getUserrating_count_total();

    @Value.Parameter
    @JsonProperty("production_year")
    @Nullable
    public abstract String getProduction_year();

    @Value.Parameter
    @JsonProperty("price_buy")
    @Nullable
    public abstract String getPrice_buy();

    @Value.Parameter
    @JsonProperty("timeframe_start")
    @Nullable
    public abstract String getTimeframe_start();

    @Value.Parameter
    @JsonProperty("timeframe_end")
    @Nullable
    public abstract String getTimeframe_end();

    @Value.Parameter
    @JsonProperty("title")
    @Nullable
    public abstract String getTitle();

    @Value.Parameter
    @JsonProperty("director_list_facet")
    @Nullable
    public abstract List<String> getDirector_list_facet();

    @Value.Parameter
    @JsonProperty("author_list_facet")
    @Nullable
    public abstract List<String> getAuthor_list_facet();

    @Value.Parameter
    @JsonProperty("production_year_list_facet")
    @Nullable
    public abstract List<String> getProduction_year_list_facet();

    @Value.Parameter
    @JsonProperty("production_year_min")
    @Nullable
    public abstract String getProduction_year_min();

    @Value.Parameter
    @JsonProperty("userrating_count_four_star")
    @Nullable
    public abstract String getUserrating_count_four_star();

    @Value.Parameter
    @JsonProperty("language_list_facet")
    @Nullable
    public abstract List<String> getLanguage_list_facet();

    @Value.Parameter
    @JsonProperty("object_class")
    @Nullable
    public abstract String getObjectClass();

    @Value.Parameter
    @JsonProperty("timestamp")
    @Nullable
    public abstract String getTimestamp();

    @Value.Parameter
    @JsonProperty("cover_url")
    @Nullable
    public abstract String getCover_url();

    @Value.Parameter
    @JsonProperty("language_piff_list_facet")
    @Nullable
    public abstract List<String> getLanguage_piff_list_facet();

    @Value.Parameter
    @JsonProperty("object_type")
    @Nullable
    public abstract String getObjectType();

    @Value.Parameter
    @JsonProperty("userrating_count_three_star")
    @Nullable
    public abstract String getUserrating_count_three_star();

    @Value.Parameter
    @JsonProperty("season_number")
    @Nullable
    public abstract String getSeason_number();

    @Value.Parameter
    @JsonProperty("description_long")
    @Nullable
    public abstract String getDescription_long();

    @Value.Parameter
    @JsonProperty("poster_url")
    @Nullable
    public abstract String getPoster_url();

    @Value.Parameter
    @JsonProperty("trailer_object")
    @Nullable
    public abstract String getTrailer_object();

    @Value.Parameter
    @JsonProperty("country_list")
    @Nullable
    public abstract List<String> getCountry_list();

    @Value.Parameter
    @JsonProperty("production_year_max")
    @Nullable
    public abstract String getProduction_year_max();

    @Value.Parameter
    @JsonProperty("cover_big_url")
    @Nullable
    public abstract String getCover_big_url();

    @Value.Parameter
    @JsonProperty("userrating_average")
    @Nullable
    public abstract String getUserrating_average();

    @Value.Parameter
    @JsonProperty("orders_rent")
    @Nullable
    public abstract String getOrders_rent();

    @Value.Parameter
    @JsonProperty("tag_list_facet")
    @Nullable
    public abstract List<String> getTag_list_facet();

    @Value.Parameter
    @JsonProperty("description_short")
    @Nullable
    public abstract String getDescription_short();

    @Value.Parameter
    @JsonProperty("media_usage_list")
    @Nullable
    public abstract List<String> getMedia_usage_list();

    @Value.Parameter
    @JsonProperty("erotic_specifier")
    @Nullable
    public abstract String getErotic_specifier();

    @Value.Parameter
    @JsonProperty("child_id_list")
    @Nullable
    public abstract List<String> getChild_id_list();

    @Value.Parameter
    @JsonProperty("_version_")
    @Nullable
    public abstract String get_version_();

    @Value.Parameter
    @JsonProperty("videocontainer_format_list")
    @Nullable
    public abstract List<String> getVideocontainer_format_list();
}

