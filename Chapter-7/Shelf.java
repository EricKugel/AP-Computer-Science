public class Shelf {
    private ReadingMaterial[] materials;

    public Shelf(ReadingMaterial[] materials) {
        this.materials = materials;
    }

    @Override
    public String toString() {
        int maxTitleLength = 0;
        for (ReadingMaterial material : materials) {
            if (material.getTitle().length() > maxTitleLength) {
                maxTitleLength = material.getTitle().length();
            }
        }

        String output = "";
        for (int row = 0; row < maxTitleLength + 2; row++) {
            for (int col = 0; col < materials.length * 2; col++) {
                if (row == maxTitleLength + 1) {
                    output += "\u203e";
                } else {
                    String title = materials[col / 2].getTitle();
                    int start = (maxTitleLength + 1) - title.length();
                    if (row - start == -1) {
                        output += "_";
                    } else if (row - start >= 0) {
                        if (col % 2 == 0) {
                            output += "|";
                        } else {
                            try {
                                output += "" + title.charAt(row - start);
                            } catch (Exception e) {
                                // do nothing
                            }
                            if (col == materials.length * 2 - 1) {
                                output += "|";
                            }
                        }
                    } else {
                        output += " ";
                    }
                }
            }
            output += "\n";
        }
        return output;
    }
}
