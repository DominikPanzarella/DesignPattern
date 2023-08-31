package Builder;

import CommonClasses.*;

public class BuilderTest
{
    /*

    public static void main(String[] args)
    {
        CommonClasses.Maze maze;
        CommonClasses.MazeGame game = new CommonClasses.MazeGame();
        MazeBuilder builder = new StandardMazeBuilder();

        game.createMaze(builder);
        maze = builder.getMaze();
    }

     */

    public static void main(String[] args)
    {
        int rooms;
        int doors;
        MazeGame game = new MazeGame();
        CountingMazeBuilder builder = new CountingMazeBuilder();


        game.createMaze(builder);

        int[] counts = builder.getCounts();
        rooms = counts[0];
        doors = counts[1];

        System.out.printf("The maze has %-5d rooms and %-5d doors\n",rooms,doors);

    }
}
