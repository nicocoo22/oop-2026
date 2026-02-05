
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Mission {

    private String missionTarget;
    private LocalDate missionDeadline;
    private int difficulty;

    public Mission() {
        Random random = new Random();
        String[] targets = {
            "Retrieve stolen data",
            "Infiltrate enemy base",
            "Rescue hostage",
            "Disable surveillance system",
            "Extract undercover agent"

        };
        this.missionTarget = targets[random.nextInt(targets.length)];
        this.missionDeadline = LocalDate.now().plusDays(random.nextInt(10) + 1);
        this.difficulty = random.nextInt(5) + 1;
    }

    public String getMissionTarget() {
        return missionTarget;
    }

    public LocalDate getMissionDeadline() {
        return missionDeadline;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public String getFormattedDeadline() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM-dd-yyyy");
        return missionDeadline.format(formatter);
    }

    public void displayMissionBriefing() {
        System.out.println("--- Mission Briefing ---");
        System.out.println("Target: " + missionTarget);
        System.out.println("Difficulty Level: " + difficulty);
        System.out.println("Deadline: " + getFormattedDeadline());

    }
}
