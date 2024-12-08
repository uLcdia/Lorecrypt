import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Map;

public class Grades {
    private ArrayList<Integer> points;
    private Map<Integer, Integer> gradeDistribution;
    
    public Grades() {
        this.points = new ArrayList<>();
        this.gradeDistribution = new TreeMap<>((a, b) -> b.compareTo(a)); // Reverse order
        for (int i = 0; i <= 5; i++) {
            this.gradeDistribution.put(i, 0);
        }
    }

    public void addGrade(int point) {
        if (point >= 0 && point <= 100) {
            this.points.add(point);
            int grade = point / 10 - 4;
            if (grade < 0) {
                grade = 0;
            }
            this.gradeDistribution.put(grade, this.gradeDistribution.getOrDefault(grade, 0) + 1);
        }
    }

    public double average() {
        return this.points.stream()
                            .mapToInt(Integer::intValue)
                            .average()
                            .orElse(-1);
    }

    public double passingAverage() {
        return this.points.stream()
                            .filter(point -> point >= 50)
                            .mapToInt(Integer::intValue)
                            .average()
                            .orElse(-1);
    }
    
    public double passPercentage() {
        if (this.points.size() == 0) {
            return -1;
        }

        return (double) this.points.stream()
                            .filter(point -> point >= 50)
                            .count() / this.points.size();
    }

    public Map<Integer, Integer> gradeDistribution() {
        return this.gradeDistribution;
    }
}
