/**
 * generated by Xtext 2.25.0
 */
package org.xtext.mdd.dgen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Views</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mdd.dgen.Views#getViewGroup <em>View Group</em>}</li>
 *   <li>{@link org.xtext.mdd.dgen.Views#getViewOption <em>View Option</em>}</li>
 * </ul>
 *
 * @see org.xtext.mdd.dgen.DgenPackage#getViews()
 * @model
 * @generated
 */
public interface Views extends EObject
{
  /**
   * Returns the value of the '<em><b>View Group</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>View Group</em>' containment reference.
   * @see #setViewGroup(ViewGroup)
   * @see org.xtext.mdd.dgen.DgenPackage#getViews_ViewGroup()
   * @model containment="true"
   * @generated
   */
  ViewGroup getViewGroup();

  /**
   * Sets the value of the '{@link org.xtext.mdd.dgen.Views#getViewGroup <em>View Group</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>View Group</em>' containment reference.
   * @see #getViewGroup()
   * @generated
   */
  void setViewGroup(ViewGroup value);

  /**
   * Returns the value of the '<em><b>View Option</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.mdd.dgen.ViewOptions}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>View Option</em>' containment reference list.
   * @see org.xtext.mdd.dgen.DgenPackage#getViews_ViewOption()
   * @model containment="true"
   * @generated
   */
  EList<ViewOptions> getViewOption();

} // Views
