public class WaterFlowing {
    public WaterFlowing() {
        System.out.println("New water sim");
    }

    public boolean canFlowOff(int[][] map, int row, int col)  {
        int here = map[row][col];

        //up
        if (row > 0) {
            System.out.println(row);
            if (map[row - 1][col] < here) {
                canFlowOff(map, row - 1, col);
            }
        } else {
            return true;
        }

        //right
        if (col < map[0].length + 1) {
            System.out.println(col);
            if (map[row][col + 1] < here) {
                canFlowOff(map, row, col + 1);
            }
        } else {
            return true;
        }

        //down
        if (row < map.length + 1) {
            System.out.println(row);
            if (map[row + 1][col] < here) {
                canFlowOff(map, row + 1, col);
            }
        } else {
            return true;
        }

        //left
        if (col > 0) {
            System.out.println(col);
            if (map[row][col - 1] < here) {
                canFlowOff(map, row, col - 1);
            }
        } else {
            return true;
        }

        //if can't reach edge return false
        return false;
    }
}
