package com.eventstore.training.scheduling.domain.writemodel.error;

import com.eventstore.training.scheduling.eventsourcing.Error;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode()
public class SlotAlreadyScheduled extends Error {}