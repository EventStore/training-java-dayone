package com.eventstore.training.scheduling.domain.writemodel.command;

import com.eventstore.training.scheduling.eventsourcing.Command;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDateTime;

@Data
public class Cancel implements Command {
  public final @NonNull String id;
  public final @NonNull String reason;
  public final @NonNull LocalDateTime cancellationTime;
}
