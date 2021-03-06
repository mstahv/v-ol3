package org.vaadin.gwtol3.client;

import com.google.gwt.core.client.JavaScriptObject;
import org.vaadin.gwtol3.client.geom.SimpleGeometry;
import org.vaadin.gwtol3.client.proj.Projection;

/**
 * Created by mjhosio on 24/06/14.
 */
public class View2D extends JavaScriptObject implements View{

    protected View2D(){

    }

    public static final native View2D create()/*-{
        return new $wnd.ol.View2D({});
    }-*/;

    public native final Extent calculateExtent(Size size)/*-{
        return this.calculateExtent(size);
    }-*/;

    /**
     * Center on coordinate and view position. Take care on the map angle.
     *
     * @param coordinate coordinate
     * @param size box pixel size
     * @param pixel Position on the view to center on
     */
    public native final void centerOn(Coordinate coordinate, Size size, Pixel pixel)/*-{
        this.centerOn(coordinate, size, pixel);
    }-*/;

    /** Gets the constrained center of this view
     *
     * @param coordinate
     */
    public native final Coordinate constrainCenter(Coordinate coordinate)/*-{
        return this.constrainCenter(coordinate);
    }-*/;

    /** Get the constrained resolution of this view.
     *
     * @param resolution
     * @param delta
     * @param direction
     * @return
     */
    public native final double constrainResolution(double resolution, double delta, double direction)/*-{
        return this.constrainResolution(resolution, delta, direction);
    }-*/;

    /**
     * Get the constrained rotation of this view.
     * @param rotation
     * @param delta
     * @return
     */
    public native final double constrainRotation(double rotation, double delta)/*-{
        return this.constrainRotation(rotation, delta);
    }-*/;

    /**
     * Fit the given extent based on the given map size.
     *
     * @param extent
     * @param size
     */
    public native final void fitExtent(Extent extent, Size size)/*-{
        this.fitExtent(extent, size);
    }-*/;

    /**
     * Fit the given geometry based on the given map size and border. Take care on the map angle.
     *
     * @param geometry
     * @param size
     */
    public native final void fitGeometry(SimpleGeometry geometry, Size size)/*-{
        this.fitGeometry(geometry, size);
    }-*/;

    /** Gets the center of the view
     *
     * @return
     */
    public native final Coordinate getCenter()/*-{
        return this.getCenter();
    }-*/;

    /** Gets the projection of the view
     *
     * @return
     */
    public native final Projection getProjection()/*-{
        return this.getProjection();
    }-*/;

    /** Gets the resolution of the view
     *
     * @return
     */
    public native final double getResolution()/*-{
        return this.getResolution;
    }-*/;

    /**
     * Get the resolution for a provided extent (in map units) and size (in pixels).
     *
     * @param extent
     * @param size
     * @return The resolution at which the provided extent will render at the given size
     */
    public native final double getResolutionForExtent(Extent extent, Size size)/*-{
        return this.getResolutionForExtent(extent, size);
    }-*/;

    /** Gets the rotation of the view
     *
     * @return
     */
    public native final double getRotation()/*-{
        return this.getRotation();
    }-*/;

    /** Gets the zoom of the view
     *
     * @return
     */
    public native final double getZoom()/*-{
        return this.getZoom();
    }-*/;

    /** Rotate the view around a given coordinate.
     *
     * @param rotation
     * @param anchor
     */
     public native final void rotate(double rotation, Coordinate anchor)/*-{
        this.rotate(rotation, anchor);
    }-*/;

    /** Set the center of the current view.
     *
     * @param coordinate
     */
     public native final void setCenter(Coordinate coordinate)/*-{
        this.setCenter(coordinate);
    }-*/;

    /** Set the projection of this view.
     *
     * @param projection
     */
    public native final void setProjection(Projection projection)/*-{
        this.setProjection(projection);
    }-*/;

    /** Set the resolution of this view.
     *
     * @param resolution
     */
    public native final void setResolution(double resolution)/*-{
        this.setResolution(resolution);
    }-*/;

    /** Set the rotation for view.
     *
     * @param rotation
     */
    public native final void setRotation(double rotation)/*-{
        this.setRotation(rotation);
    }-*/;

    /**
     * Zoom to a specific zoom level
     *
     * @param zoom
     */
    public native final void setZoom(double zoom)/*-{
        this.setZoom(zoom);
    }-*/;


}
