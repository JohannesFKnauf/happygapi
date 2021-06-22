(ns happygapi.securitycenter.folders
  "Security Command Center API: folders.
  Security Command Center API provides access to temporal views of assets and findings within an organization.
  See: https://cloud.google.com/security-command-centerapi/reference/rest/v1/folders"
  (:require [cheshire.core :as json]
            [clj-http.client :as http]
            [happy.util :as util]))

(defn sources-list$
  "https://cloud.google.com/security-command-centerapi/reference/rest/v1/folders/sources/list
  
  Required parameters: parent
  
  Optional parameters: pageSize, pageToken
  
  Lists all sources belonging to an organization."
  {:scopes ["https://www.googleapis.com/auth/cloud-platform"]}
  [auth parameters]
  {:pre [(util/has-keys? parameters #{:parent})]}
  (util/get-response
   (http/get
    (util/get-url
     "https://securitycenter.googleapis.com/"
     "v1/{+parent}/sources"
     #{:parent}
     parameters)
    (merge-with
     merge
     {:throw-exceptions false,
      :query-params parameters,
      :accept :json,
      :as :json}
     auth))))

(defn sources-findings-setState$
  "https://cloud.google.com/security-command-centerapi/reference/rest/v1/folders/sources/findings/setState
  
  Required parameters: name
  
  Optional parameters: none
  
  Body: 
  
  {:startTime string, :state string}
  
  Updates the state of a finding."
  {:scopes ["https://www.googleapis.com/auth/cloud-platform"]}
  [auth parameters body]
  {:pre [(util/has-keys? parameters #{:name})]}
  (util/get-response
   (http/post
    (util/get-url
     "https://securitycenter.googleapis.com/"
     "v1/{+name}:setState"
     #{:name}
     parameters)
    (merge-with
     merge
     {:content-type :json,
      :body (json/generate-string body),
      :throw-exceptions false,
      :query-params parameters,
      :accept :json,
      :as :json}
     auth))))

(defn sources-findings-list$
  "https://cloud.google.com/security-command-centerapi/reference/rest/v1/folders/sources/findings/list
  
  Required parameters: parent
  
  Optional parameters: compareDuration, fieldMask, filter, orderBy, pageSize, readTime, pageToken
  
  Lists an organization or source's findings. To list across all sources provide a `-` as the source id. Example: /v1/organizations/{organization_id}/sources/-/findings"
  {:scopes ["https://www.googleapis.com/auth/cloud-platform"]}
  [auth parameters]
  {:pre [(util/has-keys? parameters #{:parent})]}
  (util/get-response
   (http/get
    (util/get-url
     "https://securitycenter.googleapis.com/"
     "v1/{+parent}/findings"
     #{:parent}
     parameters)
    (merge-with
     merge
     {:throw-exceptions false,
      :query-params parameters,
      :accept :json,
      :as :json}
     auth))))

(defn sources-findings-updateSecurityMarks$
  "https://cloud.google.com/security-command-centerapi/reference/rest/v1/folders/sources/findings/updateSecurityMarks
  
  Required parameters: name
  
  Optional parameters: startTime, updateMask
  
  Body: 
  
  {:marks {}, :name string, :canonicalName string}
  
  Updates security marks."
  {:scopes ["https://www.googleapis.com/auth/cloud-platform"]}
  [auth parameters body]
  {:pre [(util/has-keys? parameters #{:name})]}
  (util/get-response
   (http/patch
    (util/get-url
     "https://securitycenter.googleapis.com/"
     "v1/{+name}"
     #{:name}
     parameters)
    (merge-with
     merge
     {:content-type :json,
      :body (json/generate-string body),
      :throw-exceptions false,
      :query-params parameters,
      :accept :json,
      :as :json}
     auth))))

(defn sources-findings-group$
  "https://cloud.google.com/security-command-centerapi/reference/rest/v1/folders/sources/findings/group
  
  Required parameters: parent
  
  Optional parameters: none
  
  Body: 
  
  {:pageSize integer,
   :groupBy string,
   :pageToken string,
   :filter string,
   :readTime string,
   :compareDuration string}
  
  Filters an organization or source's findings and groups them by their specified properties. To group across all sources provide a `-` as the source id. Example: /v1/organizations/{organization_id}/sources/-/findings, /v1/folders/{folder_id}/sources/-/findings, /v1/projects/{project_id}/sources/-/findings"
  {:scopes ["https://www.googleapis.com/auth/cloud-platform"]}
  [auth parameters body]
  {:pre [(util/has-keys? parameters #{:parent})]}
  (util/get-response
   (http/post
    (util/get-url
     "https://securitycenter.googleapis.com/"
     "v1/{+parent}/findings:group"
     #{:parent}
     parameters)
    (merge-with
     merge
     {:content-type :json,
      :body (json/generate-string body),
      :throw-exceptions false,
      :query-params parameters,
      :accept :json,
      :as :json}
     auth))))

(defn sources-findings-patch$
  "https://cloud.google.com/security-command-centerapi/reference/rest/v1/folders/sources/findings/patch
  
  Required parameters: name
  
  Optional parameters: updateMask
  
  Body: 
  
  {:category string,
   :parent string,
   :name string,
   :createTime string,
   :state string,
   :canonicalName string,
   :externalUri string,
   :resourceName string,
   :securityMarks {:marks {}, :name string, :canonicalName string},
   :sourceProperties {},
   :severity string,
   :eventTime string}
  
  Creates or updates a finding. The corresponding source must exist for a finding creation to succeed."
  {:scopes ["https://www.googleapis.com/auth/cloud-platform"]}
  [auth parameters body]
  {:pre [(util/has-keys? parameters #{:name})]}
  (util/get-response
   (http/patch
    (util/get-url
     "https://securitycenter.googleapis.com/"
     "v1/{+name}"
     #{:name}
     parameters)
    (merge-with
     merge
     {:content-type :json,
      :body (json/generate-string body),
      :throw-exceptions false,
      :query-params parameters,
      :accept :json,
      :as :json}
     auth))))

(defn assets-updateSecurityMarks$
  "https://cloud.google.com/security-command-centerapi/reference/rest/v1/folders/assets/updateSecurityMarks
  
  Required parameters: name
  
  Optional parameters: startTime, updateMask
  
  Body: 
  
  {:marks {}, :name string, :canonicalName string}
  
  Updates security marks."
  {:scopes ["https://www.googleapis.com/auth/cloud-platform"]}
  [auth parameters body]
  {:pre [(util/has-keys? parameters #{:name})]}
  (util/get-response
   (http/patch
    (util/get-url
     "https://securitycenter.googleapis.com/"
     "v1/{+name}"
     #{:name}
     parameters)
    (merge-with
     merge
     {:content-type :json,
      :body (json/generate-string body),
      :throw-exceptions false,
      :query-params parameters,
      :accept :json,
      :as :json}
     auth))))

(defn assets-list$
  "https://cloud.google.com/security-command-centerapi/reference/rest/v1/folders/assets/list
  
  Required parameters: parent
  
  Optional parameters: pageToken, fieldMask, compareDuration, pageSize, filter, readTime, orderBy
  
  Lists an organization's assets."
  {:scopes ["https://www.googleapis.com/auth/cloud-platform"]}
  [auth parameters]
  {:pre [(util/has-keys? parameters #{:parent})]}
  (util/get-response
   (http/get
    (util/get-url
     "https://securitycenter.googleapis.com/"
     "v1/{+parent}/assets"
     #{:parent}
     parameters)
    (merge-with
     merge
     {:throw-exceptions false,
      :query-params parameters,
      :accept :json,
      :as :json}
     auth))))

(defn assets-group$
  "https://cloud.google.com/security-command-centerapi/reference/rest/v1/folders/assets/group
  
  Required parameters: parent
  
  Optional parameters: none
  
  Body: 
  
  {:readTime string,
   :filter string,
   :pageToken string,
   :groupBy string,
   :compareDuration string,
   :pageSize integer}
  
  Filters an organization's assets and groups them by their specified properties."
  {:scopes ["https://www.googleapis.com/auth/cloud-platform"]}
  [auth parameters body]
  {:pre [(util/has-keys? parameters #{:parent})]}
  (util/get-response
   (http/post
    (util/get-url
     "https://securitycenter.googleapis.com/"
     "v1/{+parent}/assets:group"
     #{:parent}
     parameters)
    (merge-with
     merge
     {:content-type :json,
      :body (json/generate-string body),
      :throw-exceptions false,
      :query-params parameters,
      :accept :json,
      :as :json}
     auth))))