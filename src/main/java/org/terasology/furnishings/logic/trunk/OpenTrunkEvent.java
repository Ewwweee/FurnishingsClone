
package org.terasology.furnishings.logic.trunk;

import org.terasology.engine.entitySystem.entity.EntityRef;
import org.terasology.engine.network.ServerEvent;
import org.terasology.gestalt.entitysystem.event.Event;

@ServerEvent
public class OpenTrunkEvent implements Event {
    private EntityRef trunkEntity;

    public OpenTrunkEvent() {
        trunkEntity = EntityRef.NULL;
    }

    public OpenTrunkEvent(EntityRef trunkEntity) {
        this.trunkEntity = trunkEntity;
    }

    public EntityRef getTrunkEntity() {
        return trunkEntity;
    }
}
