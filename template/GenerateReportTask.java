package template;

public class GenerateReportTask extends Task {

  public GenerateReportTask(AudioTrail audioTrail) {
    super(audioTrail);
  }

  @Override
  protected void doTask() {
    System.out.println("Generating reports");
  }

  @Override
  protected void cleanTask() {
    System.out.println("Reports generated");
  }
}
