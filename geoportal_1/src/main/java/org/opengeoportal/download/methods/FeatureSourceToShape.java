package org.opengeoportal.download.methods;

import java.io.File;
import java.util.Set;

import com.vividsolutions.jts.geom.Envelope;

public interface FeatureSourceToShape {

	Set<File> exportToShapefiles() throws Exception;

	void setFeatureCollectionBBox(Envelope bbox) throws Exception;

	FeatureSourceRetriever getFeatureSourceRetriever();

}