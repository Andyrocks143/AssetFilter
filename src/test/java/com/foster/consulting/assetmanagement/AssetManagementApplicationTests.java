package com.foster.consulting.assetmanagement;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.foster.consulting.assetmanagement.dto.response.AssetResponseCollectionDTO;
import com.foster.consulting.assetmanagement.service.AssetRequestResource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.foster.consulting.assetmanagement.service.MovieList;

import javax.ws.rs.core.Response;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AssetManagementApplicationTests {

	AssetRequestResource assetRequestResource = new AssetRequestResource();

	@Test
	public void contextLoads() {
	}

	/******************************************************************************************************
	 * {@link MovieList#getAssetByType(String)}
	 */

	@Test
	public void getAssetByType_movie_returnsList() throws JsonProcessingException {



		AssetResponseCollectionDTO assetResponseCollectionDTO = (AssetResponseCollectionDTO) assetRequestResource
			.getAssetByType("Movie")
			.getEntity();

		assertThat(assetResponseCollectionDTO.getAssets().size(), is(500));
	}

	@Test
	public void getAssetByType_series_returnsList() throws JsonProcessingException {

		AssetResponseCollectionDTO assetResponseCollectionDTO = (AssetResponseCollectionDTO) assetRequestResource
			.getAssetByType("Series")
			.getEntity();

		assertThat(assetResponseCollectionDTO.getAssets().size(), is(100));
	}

	@Test
	public void getAssetByType_seasons_returnsList() throws JsonProcessingException {

		Response assetResponseCollectionDTO = assetRequestResource.getAssetByType("Seasons");

		assertThat(assetResponseCollectionDTO.getStatus(), is(200));
	}

	@Test
	public void getAssetByType_episodes_returnsList() throws JsonProcessingException {

		AssetResponseCollectionDTO assetResponseCollectionDTO = (AssetResponseCollectionDTO) assetRequestResource
			.getAssetByType("Episode")
			.getEntity();

		assertThat(assetResponseCollectionDTO.getAssets().size(), is(300));
	}

	/******************************************************************************************************
	 * {@link MovieList#getAllAssets()}
	 */
	@Test
	public void getAllAssets_returns1000Assets() throws JsonProcessingException {

		AssetResponseCollectionDTO assetResponseCollectionDTO = (AssetResponseCollectionDTO) assetRequestResource
			.getAllAssets()
			.getEntity();

		assertThat(assetResponseCollectionDTO.getAssets().size(), is(1000));

	}

}
