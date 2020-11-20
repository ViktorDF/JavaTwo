package lessonOne;

public class Team {

    private String nameTeam;
    private Participant[] memberTeam;

    public Team (String nameTeam, Participant... memberTeam) {
        this.nameTeam = nameTeam;
        this.memberTeam = memberTeam;
    }

    public void showResults() {
        System.out.println(nameTeam + ":");
        for (Participant p : memberTeam) {
            p.showResults();
        }
    }

    public void showFinishResults() {
        System.out.println("Из команды " + nameTeam + " до финиша добрались:");
        for (Participant p : memberTeam) {
            if (p.result()){
                p.showResults();
            }
        }
    }

    public Participant[] getMemberTeam() {
        return memberTeam;
    }
}
