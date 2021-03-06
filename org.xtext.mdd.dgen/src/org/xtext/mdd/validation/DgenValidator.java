/*
 * generated by Xtext 2.25.0
 */
package org.xtext.mdd.validation;

import org.eclipse.xtext.validation.Check;
import org.xtext.mdd.dgen.DataType;
import org.xtext.mdd.dgen.DgenPackage;
import org.xtext.mdd.dgen.Entity;
import org.xtext.mdd.dgen.Feature;
import org.xtext.mdd.dgen.Domainmodel;

import java.util.HashSet;
import java.util.Objects;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class DgenValidator extends AbstractDgenValidator {
	
	public static final String INVALID_NAME = "invalidName";

	@Check
	public void checkEntityStartsWithCapital(Entity entity) {
		if (!Character.isUpperCase(entity.getName().charAt(0))) {
			warning("Nome da entity deve come?ar com letra mai?scula",
					DgenPackage.Literals.TYPE__NAME,
					INVALID_NAME);
		}
	}

    @Check
    public void checkFeatureAlreadyExistsInSuperType(Feature feature) {
        Entity superEntity = ((Entity) feature.eContainer()).getSuperType();
        while (superEntity != null) {
            for (Feature other : superEntity.getFeatures()) {
                if (Objects.equals(feature.getName(), other.getName())) {
                    error("Feature j? existente na entidade pai", DgenPackage.Literals.FEATURE__NAME);
                    return;
                }
            }
            superEntity = superEntity.getSuperType();
        }
    }

    @Check
    public void checkFeatureAlreadyExistsInEntity(Feature feature) {
        Entity entity = (Entity) feature.eContainer();
        for (Feature other : entity.getFeatures()) {
            if (feature != other && Objects.equals(feature.getName(), other.getName())) {
                error("Feature duplicada", DgenPackage.Literals.FEATURE__NAME);
                return;
            }
        }
    }

    @Check 
    public void checkDataTypes(DataType dataType) {
        if (!(
            dataType.getName().equals("Int")    || 
            dataType.getName().equals("Float")  || 
            dataType.getName().equals("String") || 
            dataType.getName().equals("Date") 
        )) {
            error("DataType inv?lido", DgenPackage.Literals.TYPE__NAME);
        }
    }
    
    @Check
    public void checkFeatureCantBeMany(Feature feature) {
        if (feature.isMany() && (
            feature.getType().getName().equals("Int")    || 
            feature.getType().getName().equals("Float")  || 
            feature.getType().getName().equals("String") || 
            feature.getType().getName().equals("Date"))
        ) {
    		error("Tipos primitivos n?o podem ser multivalorados", DgenPackage.Literals.FEATURE__MANY);
    		return;
        }
    }
}
	

