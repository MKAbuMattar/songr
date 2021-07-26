package com.mk.songr;

import com.mk.songr.Controller.AlbumController;
import com.mk.songr.Controller.SongController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SongrApplicationTestsMockMvc {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    private WebApplicationContext wac;

    @Autowired
    private AlbumController albumController;

    @Autowired
    private SongController songController;


    @Before
    public void setup(){
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void testAlbumController() {
        assertNotNull(albumController);
    }

    @Test
    public void testSongController() {
        assertNotNull(songController);
    }

    @Test
    public void testRequestToAlbums() throws Exception {
        mockMvc.perform(get("/albums"))
                .andExpect(status().isOk());
    }
    @Test
    public void testRequestToSongs() throws Exception {
        mockMvc.perform(get("/songs"))
                .andExpect(status().isOk());
    }
}
