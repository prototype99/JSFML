package org.jsfml.window.event;

import org.jsfml.Intercom;
import org.jsfml.system.Vector2i;

/**
 * Represents window resize events.
 * <p/>
 * Objects of this class are created for events of type
 * {@link Event.Type#RESIZED}.
 */
@Intercom
public final class SizeEvent extends Event {
    /**
     * The new size of the window in pixels.
     */
    public final Vector2i size;

    @Intercom
    SizeEvent(int type, int width, int height) {
        super(type);
        this.size = new Vector2i(width, height);
    }

    @Override
    public SizeEvent asSizeEvent() {
        return this;
    }
}
