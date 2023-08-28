package Lesson_2.zadacha_2_1_8;




public class Robot {
int x;
int y;
Direction dir;

    public Robot(int x, int y, Direction dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public static void main(String[] args) {
        Robot robot=new Robot(0,0,Direction.UP);
        moveRobot(robot,3,0);
robot.turnRight();
robot.stepForward();
robot.stepForward();
robot.stepForward();
        System.out.println("конечная точка " +robot.getX()+" " + robot.getY()+ " направление взгляда "+ robot.getDirection());

    }
    public static void moveRobot(Robot robot, int toX, int toY) {

        System.out.println("начальная позиция "+ robot.getX()+ " " +robot.getY()+ " направление взгляда "+ robot.getDirection());
if (toX>=0){
    robot.dir=Direction.RIGHT;
}else if (toX<0){
    robot.dir=Direction.LEFT;
        }
if (toY>=0){
    robot.dir=Direction.UP;
} else if (toY<0) {
    robot.dir=Direction.DOWN;

}
    }

    public Direction getDirection() {
return dir;
    }

        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }
        public void turnLeft() {
if (dir==Direction.UP){
    dir=Direction.LEFT;
}
else if (dir==Direction.DOWN){
    dir=Direction.RIGHT;
} else if (dir==Direction.LEFT) {
    dir=Direction.DOWN;

} else if (dir==Direction.RIGHT) {
    dir=Direction.UP;
}
        }
        public void turnRight() {
if (dir==Direction.DOWN){
    dir=Direction.LEFT;
} else if (dir==Direction.LEFT) {
    dir=Direction.UP;
    } else if (dir==Direction.UP) {
    dir=Direction.RIGHT;
} else if (dir==Direction.RIGHT) {
    dir=Direction.DOWN;
}
        }
        public void stepForward() {
        // шаг в направлении взгляда
            // за один шаг робот изменяет одну свою координату на единицу
if (dir==Direction.UP){
    y++;
} else if (dir==Direction.DOWN) {
    y--;
} else if (dir==Direction.RIGHT) {
    x++;
} else if (dir==Direction.LEFT) {
    x--;
}
        }
    }
       enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT;
    }


