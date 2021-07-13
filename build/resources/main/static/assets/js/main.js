let mainNav = document.getElementById('menu');
let navBarToggle = document.getElementById('navbarToggle');

navBarToggle.addEventListener('click', () => {
  mainNav.classList.toggle('active');
});

const albumsBtn = document.getElementById('albumsBtn');

const addAlbumBtn = document.getElementById('addAlbumBtn');

const albumsTab = document.getElementById('albumsTab');

const addAlbumTab = document.getElementById('addAlbumTab');

const addAlbum = document.getElementById('addAlbum');

const albums = document.getElementById('albums');


albumsBtn.addEventListener('click', () => {
  albumsTab.classList.add('active');
  addAlbumTab.classList.remove('active');
  addAlbum.classList.add('hide');
  albums.classList.remove('hide');
});

addAlbumBtn.addEventListener('click', () => {
  albumsTab.classList.remove('active');
  addAlbumTab.classList.add('active');
  addAlbum.classList.remove('hide');
  albums.classList.add('hide');
});