/**
 * generated by Xtext 2.25.0
 */
package org.xtext.mdd.dgen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mdd.dgen.Entity#getViews <em>Views</em>}</li>
 *   <li>{@link org.xtext.mdd.dgen.Entity#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.xtext.mdd.dgen.Entity#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see org.xtext.mdd.dgen.DgenPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends Type
{
  /**
   * Returns the value of the '<em><b>Views</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Views</em>' containment reference.
   * @see #setViews(Views)
   * @see org.xtext.mdd.dgen.DgenPackage#getEntity_Views()
   * @model containment="true"
   * @generated
   */
  Views getViews();

  /**
   * Sets the value of the '{@link org.xtext.mdd.dgen.Entity#getViews <em>Views</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Views</em>' containment reference.
   * @see #getViews()
   * @generated
   */
  void setViews(Views value);

  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(Entity)
   * @see org.xtext.mdd.dgen.DgenPackage#getEntity_SuperType()
   * @model
   * @generated
   */
  Entity getSuperType();

  /**
   * Sets the value of the '{@link org.xtext.mdd.dgen.Entity#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(Entity value);

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.mdd.dgen.Feature}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see org.xtext.mdd.dgen.DgenPackage#getEntity_Features()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeatures();

} // Entity
