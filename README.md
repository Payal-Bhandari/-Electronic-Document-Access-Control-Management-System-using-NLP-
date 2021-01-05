# document-access-control-management-using-NLP

## Abstract
Electronic Document Access Control Management has been challenging as large scale organizations and various governments are transitioning towards an electronic media platform. The electronic medium includes the majority of the electronic documents that are utilized for their ease in sharing and storage. The increasing numbers of documents that are being stored are becoming highly difficult to store and manage manually. The risk of sensitive documents being accessed by an unauthorized person is also a looming threat that needs to be eliminated. There has been a considerable amount of research that has been performed for enabling an effective Document Management System. But most of them fall short of the expectations due to their inability to accurately perform automatic access control. Therefore, this paper outlines an effective and secure technique for the maintenance of an access control mechanism through a Machine learning approach. The presented technique implements 
* Term Frequency – Inverse Document Frequency (TF-IDF)
* Entropy Evaluation 
* Decision tree

To achieve an accurate and reliable Document Management System. The automatic electronic document access control relieves the manual calibration of the Document Management system significantly. Our experiments demonstrate that compared to the traditional document management system our EDACM system yields a Root Mean Square Error score of ``1.48`` which is significantly less and employes an accuracy of ``85.71%``, thus denotes a better fit model. Thus, our approach exclusively boosts the performance of Document Access Control Management.

## Dataset
The system is evaluated using controlled experiments basedon datasets collected from deployments of a real-world organization with different scales. The organization is a software company with over 10 senior employees and 23 junior level	employees. We took into consideration the document database of the organization which consisted a total of 56 documents consisting of a wide variety of styles, keywords and content. The records were to be classified according to the hierarchy in the organization. Based on the proposed methodology, the documents of higher importance were to be accessed only by the senior employees. We assess the efficacy of the proposed method of document management. It was noted that, with great precision, the records were effectively handled and classified.Out of the total 56 records, 48 records were effectively handled.

## Results and Conclusion

The methodology for the Document management system with automated access control mechanism has been detailed in this publication. The presented system leverages the Nat-
ural Language Processing paradigm along with the machine learning approaches. The documents that are stored by the individual are first pre-processed to remove the redundant data.
The developed model helps in preventing overwritten changes, misfiled items, and confusion over file versions. After the pre-processing, the TF-IDF module performs the frequency analysis of the words contained in the document. Then the
entropy of the achieved frequencies is calculated using the Shannon information gain approach to understand the importance of the document. The importance is achieved through the entropy estimation is subjected to the Decision tree approach to determine the level of access control to be applied to thedocument effectively. The automatic access control relieves
the manual calibration of the Document Management system significantly. The experimental evaluation of the approach has achieved an RMSE score of 1.48 which is impressive for a first attempt.
