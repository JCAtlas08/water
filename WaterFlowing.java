public class WaterFlowing {
    public WaterFlowing() {
        System.out.println("New water sim");
    }

    public boolean canFlowOff(int[][] map, int row, int col)  {
        int here = map[row][col];

        /*
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
        */
       
        if (row == 0 || row == map.length - 1 || col == 0 || col == map[0].length - 1) {
            return true;
        }
        boolean up = false, right = false, down = false, left = false;

        //up
        if (map[row - 1][col] < here) {
            up = true;
        }
        //right
        if (map[row][col + 1] < here) {
            right = true;
        }
        //down
        if (map[row + 1][col] < here) {
            down = true;
        }
        //left
        if (map[row][col - 1] < here) {
            left = true;
        }
        if (up || right || down || left) {
            return canFlowOff(map, row - 1, col) || canFlowOff(map, row, col + 1) || canFlowOff(map, row + 1, col) || canFlowOff(map, row, col - 1);
        }

        return false;
    }
}
