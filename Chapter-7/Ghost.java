enum Color {RED, PINK, CYAN, ORANGE, BLUE}

public class Ghost extends PacMan {
    private Color defaultColor;
    private Color currentColor;
    private boolean attackMode;
    private MsPacMan msPacMan;

    
    public Ghost(String name, Direction facing, int speed, 
        Color defaultColor, boolean attackMode, MsPacMan msPacMan) {
        super(name, facing, speed);
        this.defaultColor = defaultColor;
        this.currentColor = defaultColor;
        this.attackMode = attackMode;
        this.msPacMan = msPacMan;
    }

    public Color getDefaultColor() {
        return defaultColor;
    }
    
    public Color getCurrentColor() {
        return currentColor;
    }

    public boolean isAttackMode() {
        return attackMode;
    }

    public MsPacMan getMsPacMan() {
        return msPacMan;
    }

    private void setColor() {
        currentColor = attackMode ? defaultColor : Color.BLUE;
    }

    private void reverseFacing() {
        Direction facing = getFacing();
        if (facing == Direction.down) {
            setFacing(Direction.up);
        } else if (facing == Direction.left) {
            
        }
    }
}
