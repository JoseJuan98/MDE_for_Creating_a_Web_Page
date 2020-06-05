/**
 */
package WorkFlowMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WorkFlowMM.File#getExtension <em>Extension</em>}</li>
 * </ul>
 *
 * @see WorkFlowMM.WorkFlowMMPackage#getFile()
 * @model
 * @generated
 */
public interface File extends Data {
	/**
	 * Returns the value of the '<em><b>Extension</b></em>' containment reference list.
	 * The list contents are of type {@link WorkFlowMM.Extension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' containment reference list.
	 * @see WorkFlowMM.WorkFlowMMPackage#getFile_Extension()
	 * @model containment="true"
	 * @generated
	 */
	EList<Extension> getExtension();

} // File
