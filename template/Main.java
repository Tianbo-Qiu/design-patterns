package template;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Task> tasks = new ArrayList<>();
    var audioTrail = new AudioTrail();
    tasks.add(new SyncDBTask(audioTrail));
    tasks.add(new GenerateReportTask(audioTrail));
    for (var task : tasks) {
      task.execute();
    }
  }
}
