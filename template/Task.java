package template;

public abstract class Task {
  private AudioTrail audioTrail;

  public Task(AudioTrail audioTrail) {
    this.audioTrail = audioTrail;
  }

  /**
   * Utilizing hooks.
   */
  public void execute() {
    audioTrail.record();
    doTask();
    cleanTask();
  }

  protected abstract void doTask();

  protected abstract void cleanTask();
}
