/*
 * Copyright (c) 1997, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package jakarta.ejb;

/**
 * This exception is thrown to a local client to indicate that the transaction associated with processing of the request
 * has been rolled back, or marked to roll back. Thus the requested operation either could not be performed or was not
 * performed because further computation on behalf of the transaction would be fruitless.
 *
 * @since EJB 2.0
 */
public class TransactionRolledbackLocalException extends EJBException {

    private static final long serialVersionUID = 2897658132751784821L;

    /**
     * Constructs a TransactionRolledbackLocalException with no detail message.
     */
    public TransactionRolledbackLocalException() {
    }

    /**
     * Constructs a TransactionRolledbackLocalException with the specified detailed message.
     *
     * @param message a {@link java.lang.String} object.
     */
    public TransactionRolledbackLocalException(String message) {
        super(message);
    }

    /**
     * Constructs a TransactionRolledbackLocalException with the specified detail message and a nested exception.
     *
     * @param message a {@link java.lang.String} object.
     * @param ex a {@link java.lang.Exception} object.
     */
    public TransactionRolledbackLocalException(String message, Exception ex) {
        super(message, ex);
    }
}
