/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.docs.guestbook.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntryService}.
 *
 * @author liferay
 * @see EntryService
 * @generated
 */
public class EntryServiceWrapper
	implements EntryService, ServiceWrapper<EntryService> {

	public EntryServiceWrapper(EntryService entryService) {
		_entryService = entryService;
	}

	@Override
	public com.liferay.docs.guestbook.model.Entry addEntry(
			long userId, long guestbookId, String name, String email,
			String message,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _entryService.addEntry(
			userId, guestbookId, name, email, message, serviceContext);
	}

	@Override
	public com.liferay.docs.guestbook.model.Entry deleteEntry(
			long entryId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _entryService.deleteEntry(entryId, serviceContext);
	}

	@Override
	public java.util.List<com.liferay.docs.guestbook.model.Entry> getEntries(
		long groupId, long guestbookId) {

		return _entryService.getEntries(groupId, guestbookId);
	}

	@Override
	public java.util.List<com.liferay.docs.guestbook.model.Entry> getEntries(
			long groupId, long guestbookId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {

		return _entryService.getEntries(groupId, guestbookId, start, end);
	}

	@Override
	public java.util.List<com.liferay.docs.guestbook.model.Entry> getEntries(
		long groupId, long guestbookId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<com.liferay.docs.guestbook.model.Entry> obc) {

		return _entryService.getEntries(groupId, guestbookId, start, end, obc);
	}

	@Override
	public int getEntriesCount(long groupId, long guestbookId) {
		return _entryService.getEntriesCount(groupId, guestbookId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _entryService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.docs.guestbook.model.Entry updateEntry(
			long userId, long guestbookId, long entryId, String name,
			String email, String message,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return _entryService.updateEntry(
			userId, guestbookId, entryId, name, email, message, serviceContext);
	}

	@Override
	public EntryService getWrappedService() {
		return _entryService;
	}

	@Override
	public void setWrappedService(EntryService entryService) {
		_entryService = entryService;
	}

	private EntryService _entryService;

}