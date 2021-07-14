package com.mk.songr;

import com.mk.songr.model.Album;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SongrApplicationTests {

	Album album;

	@Test
	void testAlbumEmpty() {
		album = new Album();
		Assertions.assertNull(album.getTitle());
		Assertions.assertNull(album.getArtist());
		Assertions.assertNull(album.getLength());
		Assertions.assertNull(album.getImageUrl());
	}

	@Test
	void testAlbumNotEmpty() {
		album = new Album("Kamikaze", "Eminem", 13, "45 min 55 sec", "https://i.scdn.co/image/ab67616d00001e02e4073def0c03a91e3fceaf73");
		Assertions.assertEquals("Kamikaze", album.getTitle());
		Assertions.assertEquals("Eminem", album.getArtist());
		Assertions.assertEquals(13, album.getSongCount());
		Assertions.assertEquals("45 min 55 sec", album.getLength());
		Assertions.assertEquals("https://i.scdn.co/image/ab67616d00001e02e4073def0c03a91e3fceaf73", album.getImageUrl());
	}

}
