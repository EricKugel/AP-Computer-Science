enum Color {red, pink, cyan, orange, blue}

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
        currentColor = attackMode ? defaultColor : Color.blue;
    }

    private void reverseFacing() {
        Direction facing = getFacing();
        if (facing == Direction.down) {
            setFacing(Direction.up);
        } else if (facing == Direction.left) {
            setFacing(Direction.right);
        } else if (facing == Direction.right) {
            setFacing(Direction.left);
        } else {
            setFacing(Direction.down);
        }
    }

    public void setAttackMode() {
        if (msPacMan.hasEaten()) {
            attackMode = false;
        } else {
            attackMode = true;
        }
        setColor();
        reverseFacing();
    }

    @Override
    public String toString() {
        String output = super.toString();
        output += "\n";
        output += "Color: " + currentColor + ", ";
        output += "Attack mode: " + attackMode;
        return output;
    }
}
