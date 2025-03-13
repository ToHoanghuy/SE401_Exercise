public class App {
    public static void main(String[] args) throws Exception {
        EntertainmentManager manager = new EntertainmentManager();

        // Nhân bản và tùy chỉnh một bộ phim
        EntertainmentProgram movie = manager.getClonedProgram("movie");
        movie.setTitle("Inception");
        movie.setDuration(148);
        ((Movie) movie).setDirector("Christopher Nolan");
        System.out.println(movie);

        // Nhân bản và tùy chỉnh một chương trình truyền hình
        EntertainmentProgram tvShow = manager.getClonedProgram("tvshow");
        tvShow.setTitle("Breaking Bad");
        tvShow.setDuration(50);
        ((TVShow) tvShow).setnumberOfEpisodes(62);
        System.out.println(tvShow);

        // Nhân bản và tùy chỉnh một sự kiện âm nhạc
        EntertainmentProgram musicEvent = manager.getClonedProgram("musicevent");
        musicEvent.setTitle("Live Concert 2025");
        musicEvent.setDuration(120);
        ((MusicEvent) musicEvent).setArtist("Coldplay");
        System.out.println(musicEvent);
    }
}
