// Copyright 2023 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0

package org.terasology.furnishings.logic.trunk;

import org.terasology.engine.entitySystem.entity.EntityRef;
import org.terasology.engine.network.ServerEvent;
import org.terasology.gestalt.entitysystem.event.Event;

@ServerEvent
public class CloseTrunkEvent implements Event {
    private EntityRef trunkEntity;

    public CloseTrunkEvent() {
        trunkEntity = EntityRef.NULL;
    }

    public CloseTrunkEvent(EntityRef trunkEntity) {
        this.trunkEntity = trunkEntity;
    }

    public EntityRef getTrunkEntity() {
        return trunkEntity;
    }
}