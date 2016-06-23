package ecst.algorithm.featureextraction;

import ecst.algorithm.analysis.DynamicMultiplier;
import ecst.algorithm.parameter.Parameter;
import ecst.combiner.PipelineData;
import ecst.utilities.MathUtilities;

/**
 * This class implements the variance feature extraction algorithm.
 * 
 * @author Matthias Ring
 *
 */
public class Variance extends OneColumnFeatureExtraction {
	
	/**
	 * Returns the name of the implementing class (= this)
	 */
	@Override
	public Class<? extends Object> getImplementingClass() {
		return Variance.class;
	}
	
	/**
	 * Initializes the algorithm parameters.
	 */
	@Override
	protected void initFeatureExtractionParameters() {
	}

	/**
	 * Returns the parameters of this algorithm.
	 */
	@Override
	protected Parameter[] getFeatureExtractionParameters() {
		return null;
	}

	/** 
	 * Returns the number of features that will be computed.
	 */
	@Override
	public int getNumberOfFeatures(int linesOfData) {
		return 1;
	}

	/**
	 * Computes the feature.
	 */
	@Override
	protected double[] computeFeaturesOnColumn(double[] data) {
		return new double[] { MathUtilities.createSummaryStatistics(data).getVariance() };
	}
	
	/**
	 * No dependencies for this algorithm.
	 */
	@Override
	protected void addDependencies() {		
	}

	/**
	 * No algorihtm-specific multipliers here.
	 */
	@Override
	protected void setMultiplier(DynamicMultiplier multiplier) {
	}
	
	/**
	 * Not yet implemented.
	 */
	@Override
	public String modelToXML(PipelineData data) {
		return null;
	}

}
