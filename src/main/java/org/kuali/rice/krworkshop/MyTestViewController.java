/**
 * Copyright 2005-2012 The Kuali Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.opensource.org/licenses/ecl2.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kuali.rice.krworkshop;

import org.kuali.rice.krad.web.controller.UifControllerBase;
import org.kuali.rice.krad.web.form.UifFormBase;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * a controller for the configuration test view
 *
 * @author Kuali Rice Team (rice.collab@kuali.org)
 */
@Controller
@RequestMapping(value = "/my-test-page")
public class MyTestViewController extends UifControllerBase {

    @Override
    protected UifFormBase createInitialForm(HttpServletRequest request) {
        return new MyTestForm();
    }

    /**
     * Displays page for testing dialogs
     */
    @Override
    @RequestMapping(params = "methodToCall=start")
    public ModelAndView start(@ModelAttribute("KualiForm") UifFormBase form, BindingResult result,
            HttpServletRequest request, HttpServletResponse response) {
        return super.start(form, result, request, response);
    }

    /**
     * Exercises the Dialog framework.
     *
     * <p>
     * Asks a series of questions of the user while processing a client request. Demonstrates the ability to go back
     * to the client bring up a Lightbox modal dialog.
     * <br>
     * Displays a few dialogs back to the user. First a yes/no dialog asking the user to pick an author.
     * Depending on which author was chosen, the user is asked to select a book.
     * The user is then given a chance to start the selection process over or continue on.
     * </p>
     *
     * @param form - test form
     * @param result - Spring form binding result
     * @param request - http request
     * @param response - http response
     * @return
     * @throws Exception
     */
//    @RequestMapping(params = "methodToCall=save")
//    public ModelAndView save(@ModelAttribute("KualiForm") UifDialogTestForm form, BindingResult result,
//            HttpServletRequest request, HttpServletResponse response) throws Exception {
//        ModelAndView mv;
//
//         // we're done, go to the next page
//        return getUIFModelAndView(form, "DialogView-Page1");
//    }
}
