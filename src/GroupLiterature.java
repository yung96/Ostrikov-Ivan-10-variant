import java.util.ArrayList;

public class GroupLiterature {
    private ArrayList<Literature> literatureList;

    public GroupLiterature() {
        this.literatureList = new ArrayList<>();
    }

    public GroupLiterature(ArrayList<Literature> literatureList) {
        this.literatureList = literatureList;
    }

    public ArrayList<Literature> getLiteratureList() {
        return literatureList;
    }

    public void setLiteratureList(ArrayList<Literature> literatureList) {
        this.literatureList = literatureList;
    }

    public void addLiterature(Literature literature) {
        literatureList.add(literature);
    }

    public boolean removeLiteratureByCode(String code) {
        boolean removed = false;
        for (int i = 0; i < literatureList.size(); i++) {
            if (literatureList.get(i).getCode().equals(code)) {
                literatureList.remove(i);
                removed = true;
                break;
            }
        }
        return removed;
    }

    public Literature getLiterature(int index) {
        if (index >= 0 && index < literatureList.size()) {
            return literatureList.get(index);
        }
        return null;
    }

    public void sortLiteratureByYear() {
        for (int i = 0; i < literatureList.size() - 1; i++) {
            for (int j = 0; j < literatureList.size() - 1 - i; j++) {
                if (literatureList.get(j).getYear() > literatureList.get(j + 1).getYear()) {
                    Literature temp = literatureList.get(j);
                    literatureList.set(j, literatureList.get(j + 1));
                    literatureList.set(j + 1, temp);
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("");
        for (Literature literature : literatureList) {
            result.append(literature.toString()).append("\n---\n");
        }
        return result.toString();
    }
}
