package Day3;

public class Voting {
	private String voterId;
    private boolean Voted = false;

    public Voting(String voterId) {
        this.voterId = voterId;
    }

    public void castVote(String candidate) {
        if (!Voted) {
            System.out.println("Vote recorded for: " + candidate);
            Voted = true;
        } else {
            System.out.println("User has already voted.");
        }
    }
    public static void main(String[] arg) {
    	
    }
}
