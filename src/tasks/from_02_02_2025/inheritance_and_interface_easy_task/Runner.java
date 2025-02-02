package tasks.from_02_02_2025.inheritance_and_interface_easy_task;

public class Runner {
    public static void main(String[] args) {
        // Создайте интерфейс Playable с методом play(), который должен быть реализован классами MusicPlayer и
        // GameConsole. Метод play() в MusicPlayer должен выводить "Playing music", а в GameConsole — "Playing game".
        MusicPlayer musicPlayer = new MusicPlayer();
        GameConsole gameConsole = new GameConsole();

        musicPlayer.play(); // Playing music
        gameConsole.play(); // Playing game
    }
}
