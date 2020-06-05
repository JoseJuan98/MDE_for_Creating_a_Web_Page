/**
 */
package WorkFlowMM;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WorkFlowMM.WorkFlow#getName <em>Name</em>}</li>
 *   <li>{@link WorkFlowMM.WorkFlow#getActors <em>Actors</em>}</li>
 * </ul>
 *
 * @see WorkFlowMM.WorkFlowMMPackage#getWorkFlow()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='initialTaskMustBeOne finalTaskMustBeOne TaskMustBePrecededByOneOperation'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot initialTaskMustBeOne='\n\t\t\tself.actors.operations->selectByType(Initial)->size() = 1' finalTaskMustBeOne='\n\t\t\tself.actors.operations->selectByType(Final)->size() = 1' TaskMustBePrecededByOneOperation='\n\t\t\tself.actors.operations->forAll( op1,op2 : Operation |\n\t\t\t\top1.next->forAll(op3 : Operation |\n\t\t\t\t((op3.oclIsKindOf(Task) or op3.oclIsKindOf(Decision))and op3 <> null and op1 <> op2) implies op2.next->forAll(op4 : Operation | \n\t\t\t\t\t((op4.oclIsKindOf(Task) or op4.oclIsKindOf(Decision)) and op4 <> null) implies op3 <> op4\n\t\t\t\t)))'"
 * @generated
 */
public interface WorkFlow extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see WorkFlowMM.WorkFlowMMPackage#getWorkFlow_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link WorkFlowMM.WorkFlow#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
	 * The list contents are of type {@link WorkFlowMM.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see WorkFlowMM.WorkFlowMMPackage#getWorkFlow_Actors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Actor> getActors();

} // WorkFlow
