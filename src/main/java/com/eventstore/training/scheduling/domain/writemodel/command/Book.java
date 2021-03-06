package com.eventstore.training.scheduling.domain.writemodel.command;

import com.eventstore.training.scheduling.eventsourcing.Command;
import lombok.Data;
import lombok.NonNull;

@Data
public class Book implements Command {
  public final @NonNull String id;
  public final @NonNull String patientId;
}
