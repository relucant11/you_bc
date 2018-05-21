export const INCREMENT = 'INCREMENT';

/************************ global actions ************************/
export const SHOW_INFO_BAR = 'SHOW_INFO_BAR';
export const HIDE_INFO_BAR = 'HIDE_INFO_BAR';
export const SHOW_GLOBAL_SPINNER = 'SHOW_GLOBAL_SPINNER';
export const HIDE_GLOBAL_SPINNER = 'HIDE_GLOBAL_SPINNER';

/************************ profile actions ************************/
// receiving
export const RECEIVE_CLASSMATES_INFO = 'RECEIVE_CLASSMATES_INFO';
export const RECEIVE_ROOMMATES_INFO = 'RECEIVE_ROOMMATES_INFO';
export const RECEIVE_FRIENDS_INFO = 'RECEIVE_FRIENDS_INFO';
export const RECEIVE_PERSONAL_INFO = 'RECEIVE_PERSONAL_INFO';
export const RECEIVE_MATCHED_USERS = 'RECEIVE_MATCHED_USERS';
// updating
export const UPDATE_CLASSMATES_VALUES = 'UPDATE_CLASSMATES_VALUES';
export const UPDATE_FRIENDS_VALUES = 'UPDATE_FRIENDS_VALUES';
export const UPDATE_ROOMMATES_VALUES = 'UPDATE_ROOMMATES';
export const UPDATE_PERSONAL_VALUES = 'UPDATE_PERSONAL_VALUES';
export const UPDATE_AVATAR = 'UPDATE_AVATAR';
export const UPDATE_WECHAT_ID = 'UPDATE_WECHAT_ID';
// UI Actions
// profile panels
export const SHOW_PROFILE_MAIN = 'SHOW_PROFILE_MAIN';
export const SHOW_MATCHING_LIST = 'SHOW_MATCHING_LIST';
// forms
export const SHOW_ROOMMATES_FORMS = 'SHOW_ROOMMATES_FORMS';
export const SHOW_FRIENDS_FORMS = 'SHOW_FRIENDS_FORMS';
export const SHOW_CLASSMATES_FORMS = 'SHOW_CLASSMATES_FORMS';
export const SHOW_PERSONAL_FORMS = 'SHOW_PERSONAL_FORMS';
export const HIDE_ROOMMATES_FORMS = 'HIDE_ROOMMATES_FORMS';
export const HIDE_FRIENDS_FORMS = 'HIDE_FRIENDS_FORMS';
export const HIDE_CLASSMATES_FORMS = 'HIDE_CLASSMATES_FORMS';
export const HIDE_PERSONAL_FORMS = 'HIDE_PERSONAL_FORMS';
export const SHOW_AVATAR_FORMS = 'SHOW_AVATAR_FORMS';
export const HIDE_AVATAR_FORMS  = 'HIDE_AVATAR_FORMS';

/************************ main list actions ************************/
export const FETCH_CANDIDATES_REQUEST = 'FETCH_CANDIDATES_REQUEST';
export const FETCH_CANDIDATES_SUCCESS = 'FETCH_CANDIDATES_SUCCESS';
export const FETCH_CANDIDATES_FAILURE = 'FETCH_CANDIDATES_FAILURE';
export const LIKE_CANDIDATE = 'LIKE_CANDIDATE';
export const LIKE_CANDIDATE_ERROR = 'LIKE_CANDIDATE_ERROR';
export const DISLIKE_CANDIDATE = 'DISLIKE_CANDIDATE';
export const DISLIKE_CANDIDATE_ERROR = 'DISLIKE_CANDIDATE_ERROR';
export const UPDATE_USER_LISTS = 'UPDATE_USER_LISTS';
export const INITIALIZE_VISIBLE_USERS = 'INITIALIZE_VISIBLE_USERS';
export const RECEIVE_MORE_CANDIDATES = 'RECEIVE_MORE_CANDIDATES';

/************************ Verification Actions ************************/
export const RECEIVE_VERIFICATION = 'RECEIVE_VERIFICATION';
export const UPDATE_EMAIL = 'UPDATE_EMAIL';
export const UPDATE_STUDENT_CARD = "UPDATE_STUDENT_CARD";
export const VERIFY_LOCATION = "VERIFY_LOCATION";
export const SWITCH_VERIFICATION_METHOD = "SWITCH_VERIFICATION_METHOD";
export const VERIFY_CODE = "VERIFY_CODE";

/************************ authentication actions ************************/
export const LOGIN_REQUEST = 'LOGIN_REQUEST';
export const LOGIN_COMPLETE = 'LOGIN_COMPLETE';
export const REGISTER_REQUEST = 'REGISTER_REQUEST';