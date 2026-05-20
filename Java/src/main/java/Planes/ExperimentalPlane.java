package Planes;

import java.util.Objects;

import models.ClassificationLevel;
import models.ExperimentalTypes;

public class ExperimentalPlane extends Plane {

	private ExperimentalTypes type;
	private ClassificationLevel classificationLevel;

	public ExperimentalPlane(PlaneSpecification specification, ExperimentalTypes type,
			ClassificationLevel classificationLevel) {
		super(specification);
		this.type = type;
		this.classificationLevel = classificationLevel;
	}

	public ClassificationLevel getClassificationLevel() {
		return classificationLevel;
	}

	public void setClassificationLevel(ClassificationLevel classificationLevel) {
		this.classificationLevel = classificationLevel;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof ExperimentalPlane))
			return false;
		if (!super.equals(o))
			return false;
		ExperimentalPlane that = (ExperimentalPlane) o;
		return type == that.type && classificationLevel == that.classificationLevel;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), type, classificationLevel);
	}

	@Override
	protected String buildDetails() {
		return ", type=" + type + ", classificationLevel=" + classificationLevel;
	}
}
