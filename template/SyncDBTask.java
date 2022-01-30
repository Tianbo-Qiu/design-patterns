package template;

public class SyncDBTask extends Task {

	public SyncDBTask(AudioTrail audioTrail) {
		super(audioTrail);
	}

	@Override
    protected void doTask() {
      System.out.println("Syncing with DB");
	}

	@Override
    protected void cleanTask() {
      System.out.println("Syncing finished");
	}

}
