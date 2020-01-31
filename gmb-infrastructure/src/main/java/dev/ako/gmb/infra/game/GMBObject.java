package dev.ako.gmb.infra.game;

/**
 * @author Anton Kozlovskyi
 * @date 31 Jan 2020
 */
public interface GMBObject {

    default String name() {return "GMBObject_" + this.getClass().getSimpleName();}

}
