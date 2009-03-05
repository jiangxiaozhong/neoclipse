/*
 * Licensed to "Neo Technology," Network Engine for Objects in Lund AB
 * (http://neotechnology.com) under one or more contributor license agreements.
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership. Neo Technology licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License
 * at (http://www.apache.org/licenses/LICENSE-2.0). Unless required by
 * applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 * OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package org.neo4j.neoclipse.action.decorate.node;

import org.eclipse.jface.action.Action;
import org.neo4j.neoclipse.action.AbstractGraphAction;
import org.neo4j.neoclipse.action.Actions;
import org.neo4j.neoclipse.view.NeoGraphViewPart;

/**
 * This action handles the node id setting.
 * @author Anders Nawroth
 */
public class ShowNodeIdsAction extends AbstractGraphAction
{
    /**
     * Default state for this view menu alternative.
     */
    public static final boolean DEFAULT_STATE = true;

    /**
     * The constructor.
     */
    public ShowNodeIdsAction( NeoGraphViewPart view )
    {
        super( Actions.NODE_ID, Action.AS_CHECK_BOX, view );
        setChecked( DEFAULT_STATE );
    }

    /**
     * Executes the action.
     */
    public void run()
    {
        graphView.getLabelProvider().setShowNodeIds( isChecked() );
        graphView.refreshPreserveLayout();
    }
}
