
public class Main {

    public static void main(String[] args) {
        SecretAgent agent = new SecretAgent("007", "Shadow", 5);
        Mission mission = new Mission();
        agent.startMission();
        mission.displayMissionBriefing();

        System.out.println("\nAgent Details:");
        System.out.println("Codename: " + agent.getCodename());
        System.out.println("Clearance Level: " + agent.getClearanceLevel());

        agent.completeMission();
        System.out.println("Mission completed at: " + agent.getLastMissionCompletionTime());

    }
}
